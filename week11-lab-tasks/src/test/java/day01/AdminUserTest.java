package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void getPasswordTest(){
        User user = new AdminUser("abcd@gmail.com", "123456");
        assertEquals("abcd@gmail.com",user.getUserEmail());
        assertEquals("******",user.getPassword());
    }

}