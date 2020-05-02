package UserQueries;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;

public class UserQueryTests {
    //private int sessid = 0;

    /*Test Set: Login
    [Range of tests to make sure the login query runs appropriately]
     */

    /*
    //Test 1: User can successfully login with correct username and password
    @Test
    public void testCorrectLogin() throws UserQueryException {
        assertEquals("sessid", userLogin("admin", "123"),
                "Login Failed");
    }

    //Test 2: User cannot login with correct username but incorrect password
    @Test
    public void testWrongPassLogin() {
        assertThrows(UserQueryException.class, () -> {
            userLogin("admin", "321");
        })
    }

    //Test 3: User cannot login with incorrect username but correct password
    @Test
    public void testWrongUserLogin() {
        assertThrows(UserQueryException.class, () -> {
            userLogin("abmin", "123");
        })
    }

    //Test 4: User cannot login with blank username and password
    @Test
    public void testBlankLogin() {
        assertThrows(UserQueryException.class, () -> {
            userLogin("", "");
        })
    }
     */

    /*Test Set: CreateUser
    [Range of tests to make sure the createUser query runs appropriately]
     */

    /*
    //Test 1: User can successfully create new user given the correct permissions
    @Test
    public void testCorrectCreateUser() throws MovieListException {
        assertEquals("User Successfully created", userCreate(sessid, "newuser", "password", true, true, true, true),
                "User Creation Failed");
    }

    //Test 2: User cannot successfully create new user with invalid session id
    @Test
    public void testInvalidCreateUser() {
        assertThrows(UserQueryException.class, () -> {
            userCreate("1235", "newuser", "password", true, true, true, true);
        })
    }

    //Test 3: User cannot successfully create new user with blank session id
    @Test
    public void testBlankCreateUser() {
        assertThrows(UserQueryException.class, () -> {
            userCreate("", "newuser", "password", true, true, true, true);
        })
    }
     */

    /*Test Set: ListUser
    [Range of tests to make sure the listUser query runs appropriately]
     */
    /*
    //Test 1: User can successfully list all users given a session id and edit users permission
    @Test
    public void testCorrectList() throws UserQueryException {
        assertEquals("User List", userList(sessid),
                "User List Failed");
    }

    //Test 2: User cannot successfully list all users given an incorrect session id
    @Test
    public void testInvalidListUser() {
        assertThrows(UserQueryException.class, () -> {
            userList("1122");
        })
    }

    //Test 3:User Cannot successfully list all users given a blank session id
    @Test
    public void testBlankListUser() {
        assertThrows(UserQueryException.class, () -> {
            userList("");
        })
    }


     */


    /*Test Set: GetUser
    [Range of tests to make sure the GetUser query runs appropriately]
     */
    /*
    //Test 1: Test the method correctly returns the given users permissions granted the username and sessid is correct
    @Test
    public void testCorrectUserGet() throws UserQueryException {
        assertEquals("1111", userGet("sessid", "Admin"),
                "Get user Failed");
    }

    //Test 2: Correct username incorrect session ID
    @Test
    public void testinssidGetUser() {
        assertThrows(UserQueryException.class, () -> {
            userGet(1122, "Admin");
        })
    }

    //Test 3: Correct session ID incorrect username
    @Test
    public void testinunameGetUser() {
        assertThrows(UserQueryException.class, () -> {
            userGet(sessid, "Jim");
        })
    }

    //Test 4: Blank session ID and username
    @Test
    public void testBlankGetUser() {
        assertThrows(UserQueryException.class, () -> {
            userGet(0, "");
        })
    }
     */

    /*Test Set: SetUserPermissions
    [Range of tests to make sure the setPassword query runs appropriately]
     */

    /*
    //Test 1: Test the method correctly changes permissions returns the acknowledgement of change
    @Test
    public void testCorrectSetPerms() throws UserQueryException {
        assertEquals("Permissions Changed", setPermission(sessid, "newuser", true, true, true, true),
                "Set permissions Failed");
    }

    //Test 2: Incorrect session ID permission test
    @Test
    public void testIncorrectSetPerms() {
        assertThrows(UserQueryException.class, () -> {
            setPassword(1122, "newuser", true, true, true, true);
        })
    }

    //Test 3: Blank session ID
    @Test
    public void testIncorrectSetPass() {
        assertThrows(UserQueryException.class, () -> {
            setPassword(0, "newuser", true, true, true, true);
        })
    }
     */

    /*Test Set: SetUserPassword
    [Range of tests to make sure the setPassword query runs appropriately]
     */

    /*
    //Test 1: Test the method correctly changes password returns the acknowledgement of change
    @Test
    public void testCorrectSetPass() throws UserQueryException {
        assertEquals("Password Changed", setPassword(sessid, " newuser" "newpassword"),
                "Set Password Failed");
    }

    //Test 2: Incorrect session ID
    @Test
    public void testIncorrectSetPass() {
        assertThrows(UserQueryException.class, () -> {
            setPassword(1122, " newuser" "newpassword2");
        })
    }

    //Test 3: Blank session ID
    @Test
    public void testIncorrectSetPass() {
        assertThrows(UserQueryException.class, () -> {
            setPassword(0, " newuser" "newpassword3");
        })
    }
     */



    /*Test Set: DeleteUser
    [Range of tests to make sure the userDelete query runs appropriately]
     */

    /*
    //Test 1: Test the method correctly deletes user returns the acknowledgement of change
    @Test
    public void testCorrectSetPass() throws UserQueryException {
        assertEquals("User Deleted", userDelete(sessid, " newuser"),
                "Delete User Failed");
    }

    //Test 2: Incorrect session ID
    @Test
    public void testIncorrectSetPass() {
        assertThrows(UserQueryException.class, () -> {
            userDelete(1122, " newuser");
        })
    }

    //Test 3: Blank session ID
    @Test
    public void testIncorrectSetPass() {
        assertThrows(UserQueryException.class, () -> {
            userDelete(0, " newuser");
        })
    }
     */

    /*Test Set: Logout
    [Range of tests to make sure the userLogout query runs appropriately]
     */

    /*
    //Test 1: Test the method correctly logs out returns the acknowledgement of change
    @Test
    public void testCorrectSetPass() throws UserQueryException {
        assertEquals("User Logged out", userLogout(sessid),
                "Delete User Failed");
    }

    //Test 2: Incorrect session ID
    @Test
    public void testIncorrectSetPass() {
        assertThrows(UserQueryException.class, () -> {
            userLogout(1122);
        })
    }

    //Test 3: Blank session ID
    @Test
    public void testIncorrectSetPass() {
        assertThrows(UserQueryException.class, () -> {
            userLogout(0);
        })
    }
     */
}
