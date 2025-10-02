package day5.multilevelinheeritance.texteditor;

public class Notepad {

	
		// TODO Auto-generated method stub
		 protected String content;

		    public Notepad() {
		        this.content = "";
		    }

		    public void write(String text) {
		        content += text; //content = content+text
		    }

		    public void displayContent() {
		        System.out.println("Notepad Content: " + content);
		    }
		    
		    
		    /*
		     * returntype funcName()
		     * {
		     * 		//statement
		     * }
		     * 
		     * */

	}