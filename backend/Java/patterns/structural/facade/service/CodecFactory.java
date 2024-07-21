package patterns.structural.facade.service;

import patterns.structural.facade.beans.VideoFile;
import patterns.structural.facade.impl.MPEG4CompressionCodec;
import patterns.structural.facade.impl.OggCompressionCodec;

public interface CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
