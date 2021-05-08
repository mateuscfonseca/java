package com.mateus.utilitarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class FileUtils {
    public static String parseFile(File file) {
        String conteudo = "";
        try(InputStream is = Files.newInputStream(file.toPath());
                BufferedReader br = new BufferedReader( new InputStreamReader(is))){
            String line = null;
            while((line = br.readLine()) != null) {
                conteudo += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return conteudo;
    }   
    public static String parseStream(InputStream is) {
        String conteudo = "";
        try(BufferedReader br = new BufferedReader( new InputStreamReader(is))){
            String line = null;
            while((line = br.readLine()) != null) {
                conteudo += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return conteudo;
    } 
    
}
