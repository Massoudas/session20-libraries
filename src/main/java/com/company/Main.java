package com.company;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class Main {
    public  boolean isAllCharactersLowerCase(String str){
        return StringUtils.isAllLowerCase(str);
    }

    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(DateUtils.addDays(today, 2));
// write your code
        try{
            Thumbnails.of(new File("D:\\New folder").listFiles())
                    .size(640, 480)
                    .outputFormat("jpg")
                    .toFiles(Rename.PREFIX_DOT_THUMBNAIL);
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
