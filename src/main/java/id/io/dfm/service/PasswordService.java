/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.io.dfm.service;

import id.io.dfm.controller.AuthenticationController;
import id.io.dfm.controller.PasswordController;
import id.io.dfm.controller.TokenController;
import javax.ws.rs.core.Response;

/**
 *
 * @author permadi
 */
public class PasswordService extends BaseService {

    private AuthenticationController authenticationController;
    private PasswordController passwordController;
    private TokenController tokenController;

    public PasswordService() {
        log = getLogger(this.getClass());
        this.authenticationController = new AuthenticationController();
        this.passwordController = new PasswordController();
        this.tokenController = new TokenController();
    }

    public Response triggerEmail() {
        Response res = null;

        return res;
    }

    public Response validateToken() {
        Response res = null;

        return res;
    }

    public Response changePassword() {
        Response res = null;

        return res;
    }

    public Response resetPassword() {
        Response res = null;

        return res;
    }

}
