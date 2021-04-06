package com.testassignments;

import com.assignment.Assignments;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testcases {
    @Test
    void validateusername()
    {
        Assignments fname = new Assignments();
        String res = fname.name("Username");
        Assertions.assertEquals("Username",res);


    }
    @Test
    void validateusernameS()
    {
        Assignments fnames = new Assignments();
        String res = fnames.name("username");
        Assertions.assertEquals("Username",res);


    }

    @Test
    void validatelastame()
    {
        Assignments lname = new Assignments();
        String res = lname.name("Userlastname");
        Assertions.assertEquals("Userlastname", res);
    }
    @Test
    void validatelastameS()
    {
        Assignments lnames = new Assignments();
        String res = lnames.name("UserLastname");
        Assertions.assertEquals("Userlastname", res);
    }

    @Test
    void validateemail()
    {
        Assignments vemail = new Assignments();
        String res = vemail.email("abc.xyz@bl.co.in");
        Assertions.assertEquals("abc.xyz@bl.co.in", res);
    }
    @Test
    void validateemailS()
    {
        Assignments vemails = new Assignments();
        String res = vemails.email("abc.gmail.com");
        Assertions.assertEquals("abc.xyz@bl.co.in", res);
    }

    @Test
    void validatePhonenum()
    {
        Assignments pnum = new Assignments();
        String res = pnum.phonenum("91 1234567890");
        Assertions.assertEquals("91 1234567890",res);
    }
    @Test
    void validatePhonenumS()
    {
        Assignments pnums = new Assignments();
        String res = pnums.phonenum("91 1234567890");
        Assertions.assertEquals("1234567890",res);
    }

    @Test
    void validatepassword()
    {
        Assignments vpass = new Assignments();
        String res = vpass.phonenum("n!k@sn1kos");
        Assertions.assertEquals("n!k@sn1kos",res);
    }
    @Test
    void validatepasswordS()
    {
        Assignments sadpass = new Assignments();
        String res = sadpass.phonenum("abcdefghij");
        Assertions.assertEquals("n!k@sn1kos",res);
    }

}
