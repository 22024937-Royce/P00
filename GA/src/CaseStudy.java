import java.util.ArrayList;
public class CaseStudy {

	
// TODO Auto-generated method stub

	public class GroupList {

	}

			public static ArrayList<Group> GroupList = new ArrayList<>();
	        


		    	
	// TODO Auto-generated constructor stub




			public static void main(String[] args) {
		        GroupList.add(new Group("Go",  "Kill yourself", "Royce"));
		        GroupList.add(new Group("I", "don't know", "Hugh Janus"));
		        GroupList.add(new Group("Lol", "C6 Xiao Gone", "Rhyce"));
		        
		        int option = 0;
		        while (option != 4) {
		            menu();
		            option = Helper.readInt("Enter an option > ");

		            if (option == 1) {
		                addGroup();
		            }
		            if (option == 2) {
		                viewAllGroup();
		            }
		            if (option == 3) {
		                deleteGroup();
		            }
		            if (option == 4) {
		                System.out.println("Quitting the portal...");
		            }

		        }

		    }

		    

		    public static void menu() {

		        System.out.println("Biker's Community Portal");
		        System.out.println("1. Add Group");
		        System.out.println("2. View all Groups");
		        System.out.println("3. Delete Group");
		        System.out.println("4. Quit");

		        Helper.line(80, "-");

		    }

		    

		    public static void addGroup() {
                String title = Helper.readString("Enter Group Title: ");
		        String description = Helper.readString("Enter Group Description: ");
		        String author = Helper.readString("Enter Group Author: ");

		        Group group = new Group(title, description, author);

		        for (Group existingGroup : GroupList) {

		            if (existingGroup.getTitle().equalsIgnoreCase(group.getTitle())) {
		                System.out.println("Group with the same title already exists. Cannot add.");
		                return;

		            }

		        }

	 

		        GroupList.add(group);

		        System.out.println("Group added successfully.");

		    }

	 

		    public static void viewAllGroup() {

		        System.out.println("All Groups:");

		        int GroupIndex = 1;

		        for (Group group : GroupList) {

		            System.out.println(GroupIndex + ". " + group.getTitle() + " " + group.getDescription() + " - " + group.getAuthor() + " ");

		            GroupIndex++;

		        }

		    }

		    public static void deleteGroup() {

		        String groupTitle = Helper.readString("Enter Group title to delete: ");
		        Group groupToDelete = null;
		        for (Group group : GroupList) {

		            if (group.getTitle().equalsIgnoreCase(groupTitle)) {

		                groupToDelete = group;

		                break;

		            }

		        }

	 

		        if (groupToDelete != null) {
		            GroupList.remove(groupToDelete);
		            System.out.println("Group With Title " + groupTitle + " has been deleted.");
		        } else {
		            System.out.println("Group With Title " + groupTitle + " not found.");

		        }

		    }





		

		}



