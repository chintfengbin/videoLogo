package com.fbin;

import org.bytedeco.javacv.FrameGrabber;
import org.junit.Test;

public class TestVideoFirstPic {

    String rootPath = "E:\\资料\\H3\\9.2.7学习\\第二天\\";
    String filePath = "E:\\资料\\H3\\9.2.7学习\\第二天\\test.mp4";
    @Test
    public void test1() throws FrameGrabber.Exception {
        String picPath = GetVideoFirstPic.videoImage(filePath,rootPath);
        System.out.println(picPath);
    }
}
