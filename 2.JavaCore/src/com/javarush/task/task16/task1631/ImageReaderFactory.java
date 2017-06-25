package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Вадим on 25.06.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg) {
        if(jpg==(ImageTypes.BMP))
        {
            return new BmpReader();
        }
        else        if(jpg==ImageTypes.JPG)
        {
            return new JpgReader();
        }
        else if(jpg==(ImageTypes.PNG))
        {
            return new PngReader();
        }
        throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}
