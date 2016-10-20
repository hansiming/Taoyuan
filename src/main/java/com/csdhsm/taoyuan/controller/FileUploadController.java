package com.csdhsm.taoyuan.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.csdhsm.taoyuan.models.UploaderParam;
import com.csdhsm.taoyuan.utils.TimeStringUtil;
import com.csdhsm.taoyuan.utils.VerifyCodeUtil;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  FileUploadController.java   
 * @Package com.csdhsm.taoyuan.controller   
 * @Description: 文件上传控制器
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月19日 下午3:48:46   
 * @version:V1.0     
 */  
@Controller
public class FileUploadController {
	
	/**   
	 * <p>Title: uploadCovertitle</p>   
	 * <p>Description: 上传封面 </p> 
	 * @param:    
	 * @return: void
	 * @Autor: Han  
	 */  
	@RequestMapping("/toCovertitleUpload")
	@ResponseBody
	public UploaderParam uploadCovertitle(@RequestParam(value = "file", required = false) MultipartFile file, 
			HttpServletRequest request) {
		
		if (file == null) {
			return null;
		}

		String fileType = file.getContentType();
		
		//如JPG等
		String newFileType = switchFileType(fileType);
		
		//文件类型检查
		if (!checkFileType(newFileType)) {
			return null;
		}
		
		//通过时间获取文件名
		String fileName = TimeStringUtil.getTimeString() + "." + newFileType;
		//存储文件的路径
		String path = request.getSession().getServletContext().getRealPath("public\\infoImg");
		//http路径
		String data = "http://" + request.getServerName() + ":" + request.getServerPort() +
				 request.getContextPath() + "/public/infoImg/" + fileName;
		
		File targetFile  = new File(path, fileName);
		
		//不存在该路径则创建该路径
		if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
		
		//保存  
        try {
            UploaderParam param = new UploaderParam();
            param.setName(data);
        	file.transferTo(targetFile);
        	return param;
        } catch (Exception e) {
        	
            e.printStackTrace();  
        }
        
        return null;
	}
	
	/**   
	 * <p>Title: upload</p>   
	 * <p>Description: 图片文件上传 </p> 
	 * @param:  @param file
	 * @param:  @param session  
	 * @Autor: Han  
	 */  
	@RequestMapping("/toImageUpload")
	@ResponseBody
	public UploaderParam upload(@RequestParam(value = "file", required = false) MultipartFile file,
			HttpServletRequest request) {
		
		if (file == null) {
			return null;
		}

		String fileType = file.getContentType();
		
		//如JPG等
		String newFileType = switchFileType(fileType);
		
		//文件类型检查
		if (!checkFileType(newFileType)) {
			return null;
		}
		
		//通过时间获取文件名
		String fileName = TimeStringUtil.getTimeString() + "." + newFileType;
		//存储文件的路径
		String path = request.getSession().getServletContext().getRealPath("public\\infoImg");
		long size = file.getSize();
		String originalName = file.getOriginalFilename();
		File targetFile  = new File(path, fileName);
		
		//不存在该路径则创建该路径
		if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
		
		UploaderParam param = null;
		
		//保存  
        try {
            
        	file.transferTo(targetFile);
            
        	param = new UploaderParam(fileName, originalName, size, UploaderParam.SUCCESS, fileType, fileName);
            
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        
        return param;
	}
	
	@RequestMapping("getVerifyCode")
	public void verifyCode(HttpServletResponse response, HttpSession session) throws IOException {
		
		ServletOutputStream outputStream = response.getOutputStream();
		String verifyCode = VerifyCodeUtil.generateVerifyCode(4);
		
		VerifyCodeUtil.outputImage(146, 40, outputStream, verifyCode);
		
		session.setAttribute("verifyCode", verifyCode);
	}
	
	/**   
	 * <p>Title: switchFileType</p>   
	 * <p>Description: 文件类型转换 </p> 
	 * @param:  @param fileType
	 * @return: String
	 * @Autor: Han  
	 */  
	private String switchFileType(String fileType) {

		if(fileType.equalsIgnoreCase("IMAGE/JPEG")) {
			
			return "jpg";
		} else if(fileType.equalsIgnoreCase("IMAGE/PNG")) {
			
			return "png";
		} else if(fileType.equalsIgnoreCase("IMAGE/GIF")) {
			
			return "gif";
		}
		
		return null;
	}

	/**   
	 * <p>Title: checkFileType</p>   
	 * <p>Description: 检查文件类型是否正确 </p> 
	 * @param:  @param fileType
	 * @return: boolean
	 * @Autor: Han  
	 */  
	private boolean checkFileType(String fileType) {
		
		if (fileType == null)
			return false;
		
		if (fileType.equalsIgnoreCase("JPG") || fileType.equalsIgnoreCase("PNG")
				|| fileType.equalsIgnoreCase("GIF"))
			return true;
			
		return false;
	}
}
