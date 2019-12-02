/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.io.dfm.controller;

import java.sql.SQLException;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.statement.Update;

/**
 *
 * @author permadi
 */
public class PasswordController extends BaseController {

    public PasswordController() {
        log = getLogger(this.getClass());
    }

    public boolean savePassword(String email, String password) {
        final String methodName = "savePassword";
        start(methodName);
        boolean isSaved = false;

        final String query = "update MasterUser set password = md5(:password) WHERE email = :email";

        try (Handle handle = getHandle()) {
            Update update = handle.createUpdate(query).bind("password", password).bind("email", email);
            isSaved = executeUpdate(update);

        } catch (SQLException ex) {
            log.error(methodName, ex);
        }

        completed(methodName);
        return isSaved;
    }

}
