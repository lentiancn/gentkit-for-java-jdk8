/*
 * Copyright (c) 2025-2025 田隆 (Len)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.gentkit.excel.utils;

import com.gentkit.excel.enums.FileTypeEnum;
import com.gentkit.excel.enums.SpreadsheetVersionEnum;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ExcelUtils {

    public static String[] fileSuffixToMimeType(final String fileSuffix) {
        if (fileSuffix == null || fileSuffix.trim().isEmpty()) {
            return new String[0];
        }
        List<String> mimeTypes = new ArrayList<>();
        for (FileTypeEnum fileTypeEnum : FileTypeEnum.values()) {
            if (fileSuffix.equals(fileTypeEnum.getFileSuffix())) {
                mimeTypes.add(fileTypeEnum.getMimeType());
            }
        }
        return mimeTypes.toArray(new String[0]);
    }

    public static String[] mimeTypeToFileSuffix(final String mimeType) {
        if (mimeType == null || mimeType.trim().isEmpty()) {
            return new String[0];
        }
        List<String> fileSuffixes = new ArrayList<>();
        for (FileTypeEnum fileTypeEnum : FileTypeEnum.values()) {
            if (mimeType.equals(fileTypeEnum.getMimeType())) {
                fileSuffixes.add(fileTypeEnum.getFileSuffix());
            }
        }
        return fileSuffixes.toArray(new String[0]);
    }

    public static SpreadsheetVersionEnum mimeTypeToSpreadsheetVersion(final String mimeType) {
        if (FileTypeEnum.XLSX.getMimeType().equals(mimeType)) {
            return SpreadsheetVersionEnum.EXCEL2007;
        }
        if (FileTypeEnum.XLS.getMimeType().equals(mimeType)) {
            return SpreadsheetVersionEnum.EXCEL97;
        }
        return null;
    }
}
