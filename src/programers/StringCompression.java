package programers;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String s = "abcabcdede";
        System.out.println(solution(s));
    }

    // 문자열 압축
    public static int solution(String s) {
        String oldLine;
        int size;
        String newLine;
        String word;
        int repeat;
        int min = s.length();            // 가장 짧은 문자열의 사이즈;

        for (int i = 0; i < s.length(); i++) {
            size = i + 1;                         // size개 단위로 자르기
            oldLine = s;
            newLine = "";                       // 새로 생성된 문자열
            repeat = 1;
            while (oldLine.length() >= size) {
                word = oldLine.substring(0, size);                                  //c
                oldLine = oldLine.substring(size, oldLine.length());                //cc
                if (oldLine.length() < size) {
                    if (repeat != 1) {
                        newLine += repeat + word + oldLine;
                    } else {
                        newLine += word + oldLine;
                    }
                    oldLine = "";
                } else {
                    if (word.equals(oldLine.substring(0, size))) {
                        repeat++;
                    } else {
                        if (repeat != 1) {
                            newLine += repeat + word;
                        } else {
                            newLine += word;
                        }
                        repeat = 1;
                    }
                }
            }
            if (newLine.length() < min) {
                min = newLine.length();
            }
        }
        return min;
    }
}
