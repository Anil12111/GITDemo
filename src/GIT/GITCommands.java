package GIT;

public class GITCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // Notes:
		 * 
		 * Configure the author name and email address to be used with your commits.
		 * 
		 * git config --global user.name "Anil"
		 * git config -- global user.email "varma.1211@gmail.com" 
		 * 
		 * Create a new local repository
		 * 
		 * git init
		 * 
		 * go to the respective folder in the local machine
		 * 
		 * cd..
		 * cd <file name>
		 * 
		 * what ever the changes you do in the local machine first it has to do staging and then commit
		 * commands to do staging
		 * 
		 * git add * ---- To add all the files
		 * git add <specific file> -- To add a specific file
		 * 
		 * Then commit
		 * we should always do commit before you do push or merge
		 * 
		 * git commit -m "First commit" --- -m represents message
		 * 
		 * Push the code to server(remote repository)
		 * 
		 * git remote add origin <server> --- server is nothing but file name of the git project location
		 * 
		 * Then push the code
		 * 
		 * git push origin master
		 * 
		 * In order to see the status of the files
		 * 
		 * git status
		 * 
		 * if some body is trying to pull the code from the remote server for first time
		 * 
		 * git clone <remote server path>
		 * 
		 * from next time onwards we can use directly pull the code
		 * 
		 * git pull origin master
		 * 
		 * Branching concept:
		 * if some architech wants to do some modifications then he will create branch nothing but the copy
		 * of the master copy then architech do his work and rest of the ppl will continu on master
		 * 
		 * how to create a new branch
		 * 
		 * git checkout -b <branchname>
		 * 
		 * Switch from one branch to another:
		 * 
		 * git checkout <branchname>
		 * 
		 * List all the branches in your repo, and also tell you what branch you're currently in:
		 * 
		 * git branch
		 * 
		 * Push the branch to your remote repository, so others can use it:
		 * 
		 * git push origin <branchname>
		 * 
		 * Merge concept:
		 * Once the changes are completed at branch level then it has to merge with master 
		 * 
		 * To merge a different branch into your active branch:
		 * 
		 * git merge <branchname>
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
