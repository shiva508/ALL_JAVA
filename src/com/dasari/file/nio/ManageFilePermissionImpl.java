package com.dasari.file.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManageFilePermissionImpl implements ManageFilePermission {

	@Override
	public void checkFileExist(String filePath, String directoryPath) {
		Path filePathOR=Paths.get(filePath);
		Path directoryPathOr=Paths.get(directoryPath);
		
		File directoryPathLo=directoryPathOr.toFile();
		File filePathLo=filePathOR.toFile();
		if(!directoryPathLo.exists()) {
			directoryPathLo.mkdirs();
			System.out.println("/////NEW DIRECTORY IS CREATED");
			try {
				filePathLo.createNewFile();
				System.out.println("/////NEW FILE IS CREATED");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
