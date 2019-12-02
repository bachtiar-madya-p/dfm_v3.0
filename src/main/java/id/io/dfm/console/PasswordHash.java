/**
  * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
  *
  * Copyright (c) 2019 Identiticoders, and individual contributors
  * as indicated by the @author tags. All Rights Reserved
  *
  * The contents of this file are subject to the terms of the
  * Common Development and Distribution License (the License).
  *
  * Everyone is permitted to copy and distribute verbatim copies
  * of this license document, but changing it is not allowed.
  *
  */
package id.io.dfm.console;

import id.io.dfm.manager.EncryptionManager;

public class PasswordHash {

    public static void main(String[] args) {
//        if (args.length == 1) {
//         
//        } else {
//            System.err.println("Usage: application plaintext-password-to-be-encrypted");
//            System.err.println("e.g.");
//            System.err.println("sg.ic.umx.console.PasswordHash mysecretpassword");
//        }
        
        EncryptionManager.init();
        System.out.println(EncryptionManager.encrypt("rootadmin"));
        System.out.println(EncryptionManager.decrypt("MZGFpVsYTCV1ZpKmFl3I4w=="));
        EncryptionManager.shutdown();
    }
        
        

}
