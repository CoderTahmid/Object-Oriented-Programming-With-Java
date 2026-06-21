class Account {
    public String name;
    protected String email;
    private String password;

    /* Way to get and set a protected data */
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class AccessModifiers {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "Tahmid";
        account1.email = "tahmid.ibne@gmail.com";
        /*
         *** Public access modifier***
         * Here we can access the public property "name"
         * if kono property public hoy tahole shei property ke
         * oi file'r jekono class theke access kora jabe
         */

        /*
         *** Default access modifier ***
         * nij package'r moddhe jekono file take access korte parbe
         * kintu onno kono package theke access kora jabe na
         */

        /*
         *** Protected access modifier ***
         * nij package'r shobai access korte parbe
         * but onno package'r only sub-class gula access korte parbe
         */

        // account1.password = "kingg";
        /*
         *** Private access modifier ***
         * private ke class'r baire keo access korte parbe na
         * shudhu ekta class thekei take access kora jabe
         * here's the error message is: "The field Account.password is not visible"
         * na pawar karon hocche ei property ta protected. So eta onno class theke access kora jabe na
         */
        account1.setPassword("thisIsTheOriginalPassword");
        System.out.println(account1.getPassword()); // Output: thisIsTheOriginalPassword
    }
}
