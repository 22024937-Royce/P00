import static org.junit.Assert.assertEquals;

 

import org.junit.Before;
import org.junit.Test;

 

import java.util.ArrayList;

 

public class GroupTest {
    private static ArrayList<Group> GroupList = new ArrayList<>();

 

    @Before
    public void setUp() {
        // Adding some random bikes for testing
        GroupList.add(new Group("Go",  "Kill yourself", "Royce"));
        GroupList.add(new Group("I", "don't know", "Hugh Janus"));
        GroupList.add(new Group("Lol", "C6 Xiao Gone", "Rhyce"));

    }

 

    @Test
    public void testAddGroup() {
        Group.addGroup("I", "Love Biking", "Royce");

 

        ArrayList<Group> GroupList = getGroupListFromGroup();
        assertEquals(4, GroupList.size());

 

        Group addedGroup = GroupList.get(3);
        assertEquals("I", addedGroup.getTitle());
        assertEquals("Love Biking", addedGroup.getDescription());
        assertEquals("Royce", addedGroup.getAuthor());
        
        String expectedOutput = "Group has been created.\n";
        assertEquals(expectedOutput, getConsoleOutput());
    }

 




	@Test
    public void testViewAllGroups() {
        Group.viewAllGroups();

 

        String expectedOutput = "All Groups:\n1. Go - Kill Yourself - Royce\n" +
                                "2. I - Don't Know - Hugh Janus\n" +
                                "3. Lol - C6 Xiao Gone - Rhyce\n";
        assertEquals(expectedOutput, getConsoleOutput());
    }

 

    @Test
    public void testDeleteGroup() {
        Group.deleteGroup(3);

        ArrayList<Group> GroupList = getGroupListFromGroup();
        assertEquals(2, GroupList.size());

        String expectedOutput = "Lol has been deleted.\n";
        assertEquals(expectedOutput, getConsoleOutput());
    }

 





	public ArrayList<Group> getGroupListFromGroup() {
        try {
            var field = Group.class.getDeclaredField("GroupList");
            field.setAccessible(true);
            return (ArrayList<Group>) field.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

 

    private String getConsoleOutput() {
        // Helper method to capture the console output
        return System.out.toString();
    }
}

	

