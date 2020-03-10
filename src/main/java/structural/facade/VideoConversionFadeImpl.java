package structural.facade;

import java.io.File;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class VideoConversionFadeImpl implements VideoConversionFacade {
    @Override
    public File convertVideo(String fileName, String destCodecStr) {
        Codec sourceCodec = Codec.get("." + fileName);
        Codec destCodec = Codec.get(destCodecStr);
        VideoFile sourceFile = new VideoFile(fileName, sourceCodec);

        VideoFile buffer = BitrateReader.read(sourceFile.getFileName(), sourceFile.getCodec());
        VideoFile intermediateResult = BitrateReader.convert(buffer, destCodec);
        File result = AudioMixer.mix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
