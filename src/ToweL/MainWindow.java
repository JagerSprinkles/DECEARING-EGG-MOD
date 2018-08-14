package ToweL;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainWindow {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

      
	
	
	
	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(724, 498);
		shell.setText("TOWEL");
		shell.setLayout(new GridLayout(17, false));
		new Label(shell, SWT.NONE);
		
		Label lblBigText = new Label(shell, SWT.NONE);
		lblBigText.setFont(SWTResourceManager.getFont("Comic Sans MS", 15, SWT.NORMAL));
		lblBigText.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
		lblBigText.setText("BIG TEXT");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		//PLAYER SPEED BUTTONS
		
		Group grpPlayerSpeed = new Group(shell, SWT.NONE);
		grpPlayerSpeed.setText("Player Speed");
		grpPlayerSpeed.setLayout(new GridLayout(1, false));
		
		Button btnNormal_Player = new Button(grpPlayerSpeed, SWT.RADIO);
		btnNormal_Player.setSelection(true);
		btnNormal_Player.setText("Normal");

		
		Button btnFast_Player = new Button(grpPlayerSpeed, SWT.RADIO);
		btnFast_Player.setText("Fast");
		
		Button btnLudicrousSpeed_Player = new Button(grpPlayerSpeed, SWT.RADIO);
		btnLudicrousSpeed_Player.setText("Ludicrous Speed");

		//SHIP SPEED BUTTONS
		
		Group grpShipSpeed = new Group(shell, SWT.NONE);
		grpShipSpeed.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		grpShipSpeed.setText("Ship Speed");
		grpShipSpeed.setLayout(new GridLayout(1, false));
		
		Button btnNormal_Ship = new Button(grpShipSpeed, SWT.RADIO);
		btnNormal_Ship.setSelection(true);
		btnNormal_Ship.setText("Normal");
		
		Button btnFast_Ship = new Button(grpShipSpeed, SWT.RADIO);
		btnFast_Ship.setText("Fast");
		
		Button btnLudicrousSpeed_Ship = new Button(grpShipSpeed, SWT.RADIO);
		btnLudicrousSpeed_Ship.setText("Ludicrous Speed");
		
		//STORM FREQ BUTTONS
		
		Group grpStormFrequency = new Group(shell, SWT.NONE);
		grpStormFrequency.setText("Storm Frequency");
		grpStormFrequency.setLayout(new GridLayout(1, false));
		
		Button btnNormal = new Button(grpStormFrequency, SWT.RADIO);
		btnNormal.setSelection(true);
		btnNormal.setText("Normal");
		
		Button btnLess = new Button(grpStormFrequency, SWT.RADIO);
		btnLess.setText("Less");
		
		Button btnNone = new Button(grpStormFrequency, SWT.RADIO);
		btnNone.setText("None");
		
		
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnInstantScan = new Button(shell, SWT.CHECK);
		btnInstantScan.setText("Instant Scan");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnTest = new Button(shell, SWT.NONE);
		btnTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				System.out.println("testt");
				
				//COPY ORIGINAL FILES TO WORKING DIRECTORY
				
				String source = "./orig";
				File srcDir = new File(source);

				String destination = "./raw";
				File destDir = new File(destination);

				try {
				    FileUtils.copyDirectory(srcDir, destDir);
				} catch (IOException e2) {
				    e2.printStackTrace();
				}
				
				
				
				//PLAYER SPEED SETTING
				
				if (btnFast_Player.getSelection()) {
					System.out.println("Player Fast");
					
					replace("./raw/", "GCPLAYERGLOBALS.GLOBAL.exml", "  <Property name=\"JetpackForce\" value=\"69\" />", "  <Property name=\"JetpackForce\" value=\"45\" />");						
					replace("./raw/", "GCPLAYERGLOBALS.GLOBAL.exml", "  <Property name=\"JetpackMaxSpeed\" value=\"600\" />", "  <Property name=\"JetpackMaxSpeed\" value=\"600\" />");						
				
				}
				if (btnNormal_Player.getSelection()) {
					System.out.println("Player Normal");
					
					replace("./raw/", "GCPLAYERGLOBALS.GLOBAL.exml", "  <Property name=\"JetpackForce\" value=\"69\" />", "  <Property name=\"JetpackForce\" value=\"35\" />");						
					replace("./raw/", "GCPLAYERGLOBALS.GLOBAL.exml", "  <Property name=\"JetpackMaxSpeed\" value=\"600\" />", "  <Property name=\"JetpackMaxSpeed\" value=\"3\" />");						

				}
				if (btnLudicrousSpeed_Player.getSelection()){
					System.out.println("Player Lud");
					
					replace("./raw/", "GCPLAYERGLOBALS.GLOBAL.exml", "  <Property name=\"JetpackForce\" value=\"69\" />", "  <Property name=\"JetpackForce\" value=\"100\" />");						
					replace("./raw/", "GCPLAYERGLOBALS.GLOBAL.exml", "  <Property name=\"JetpackMaxSpeed\" value=\"600\" />", "  <Property name=\"JetpackMaxSpeed\" value=\"1000\" />");						

				}
				
//		        System.out.print(player_Speed.getText());
//		        System.out.println(" selected = " + player_Speed.getSelection());
//				
				
//				boolean playerSpeed = btnFast_Player.getSelection()
//						
//				
//				
//				switch (playerSpeed) {
//				
//				}
//				
				try {
					Runtime.getRuntime().exec("./MBINCompiler.exe ./raw/ ./packed/");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				try {
					Runtime.getRuntime().exec("PSArcTool.exe ./packed");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				try {
					
					FileUtils.moveFile(FileUtils.getFile("./psarc.pak"), FileUtils.getFile("./DECEARING_EGG.pak"));
					
//					FileUtils.moveFile(
//				      FileUtils.getFile("./psarc.pak"), 
//				      FileUtils.getFile("./DECEARING_EGG.pak"));
				} catch (Exception e2) {
					// TODO: handle exception
				}

				System.out.println("testt222");
				//replaceSelected("test", "1");
			}
		});
		btnTest.setText("Test");
		
		

	}
	
	public void rename_Pak() throws IOException {
	    FileUtils.moveFile(
	      FileUtils.getFile("src/test/resources/fileToMove.txt"), 
	      FileUtils.getFile("src/test/resources/fileMoved.txt"));
	}
	
	public static void replace(String path, String file, String original, String replace) {
	    try {
	        // input the file content to the StringBuffer "input"
	        //BufferedReader file = new BufferedReader(new FileReader("test.txt"));
	        Path FILE_PATH = Paths.get(path, file);
	        List<String> fileContent = new ArrayList<>(Files.readAllLines(FILE_PATH, StandardCharsets.UTF_8));

	        for (int i = 0; i < fileContent.size(); i++) {
	            if (fileContent.get(i).contains(original)) {
	                fileContent.set(i, replace);
	                
	                //break;
	            }
	        }

	        Files.write(FILE_PATH, fileContent, StandardCharsets.UTF_8);
	        
//	        String line;
//	        StringBuffer inputBuffer = new StringBuffer();
//
//	        while ((line = file.readLine()) != null) {
//	            inputBuffer.append(line);
//	            inputBuffer.append('\n');
//	        }
//	        String inputStr = inputBuffer.toString();
//
//	        file.close();
//
//	        System.out.println(inputStr); // check that it's inputted right
//
//	        // this if structure determines whether or not to replace "0" or "1"
//	        if (Integer.parseInt(type) == 0) {
//	            inputStr = inputStr.replace(replaceWith + "1", replaceWith + "0"); 
//	        }
//	        else if (Integer.parseInt(type) == 1) {
//	            inputStr = inputStr.replace(replaceWith + "0", replaceWith + "1");
//	        } 
//
//	        // check if the new input is right
//	        System.out.println("----------------------------------\n"  + inputStr);
//
//	        // write the new String with the replaced line OVER the same file
//	        FileOutputStream fileOut = new FileOutputStream("notes.txt");
//	        fileOut.write(inputStr.getBytes());
//	        fileOut.close();

	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}
}
