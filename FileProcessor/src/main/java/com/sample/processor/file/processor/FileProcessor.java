package com.sample.processor.file.processor;

import java.io.Reader;

public interface FileProcessor<T> {
    
    T processFile(Reader r);
}
