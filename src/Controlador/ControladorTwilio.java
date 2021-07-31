/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author Auxiliar
 */
public class ControladorTwilio {

    public static final String ACCOUNT_SID = "AC61e9692e7d66c310138028a6d91af77a";
    public static final String AUTH_TOKEN = "ac522ffa0841804ce6b5ea2d92e727f1";

    public static void enviarWhatsappTwilio() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+573017852750"),
                "MG8c84b09a95c68b1fbafd4f8f62c60418",
                "Hello wold!")
                .create();

        System.out.println(message.getSid());
    }
}
