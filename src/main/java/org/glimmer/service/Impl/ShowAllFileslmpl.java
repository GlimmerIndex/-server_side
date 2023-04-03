package org.glimmer.service.Impl;

import org.glimmer.domain.PDFFiles;
import org.glimmer.mapper.PDFFilesMapper;
import org.glimmer.service.ShowAllFiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowAllFileslmpl implements ShowAllFiles {

    @Autowired
    PDFFilesMapper pdfFilesMapper;

    @Override
    public List<PDFFiles> ShowFiles(){
        List<PDFFiles> pdfFiles = pdfFilesMapper.findAll();
        if(pdfFiles.isEmpty()){
            System.out.println("kong");
        }
        return pdfFiles;
    }

}
