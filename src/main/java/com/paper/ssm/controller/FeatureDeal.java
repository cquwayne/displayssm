package com.paper.ssm.controller;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


@RestController
public class FeatureDeal {

//    public final String path = "C:\\Users\\76133\\OneDrive\\毕业\\论文系统\\数据\\";
//    public final String pathName = path+"test.xlsx";
    public final String path = "D:\\display\\displayvue\\static\\";

    public int dealWith (LinkedHashMap<List<String>,String> featureList, String sceneDataTitle) throws Exception {

//        ① 根据每个HashMap中key值的List<String>读取原始数据excel文件中的数据项
//        ② 依据HashMap中的value值的String对应的方法进行数据处理，并将处理后的数据插入训练数据集的Excel文件

//        具体步骤为：
//        1. 读取原始数据集合excel文件（文件名：“”），读取为XSSFWorkbook对象，对象名称workbook
//        2. 获取excel文件中的第一行，找准Key中List<String>数据项所在的列,并创建新的数据列,提供数据列名
//        3. 对于数据项所在的列，每读取一行就计算一行,将计算结果放至新的数据项列


        try {
        /*
          读取原始数据集合所在的Excel文件
         */
            String fileName = path + sceneDataTitle + ".xlsx";
            File file = new File(fileName);
//        File file = new File(pathName);
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
//        两种方式读取工作表
            Sheet sheet = workbook.getSheetAt(0);
//        获取第一行的数据
            Row row = sheet.getRow(0);

        /*
          遍历所有的特征计算单元,对每一个特征计算单元进行计算
         */
//        获取迭代器
            Iterator iterator = featureList.entrySet().iterator();
            while (iterator.hasNext()) {
    //            获取迭代器对象,即其中一个计算单元
                Map.Entry<List<String>, String> entry = (Map.Entry)iterator.next();
    //            获取当前计算单元要处理的原始数据项
                List<String> key = entry.getKey();
    //            获取当前计算单元的处理函数名称或者说类型
                String value = entry.getValue();
    //            数据特征名称
                String dataName = key.get(key.size()-1);
              /*
                识别所有需要操作的数据项
              */

    //        获取第一行所有数据项的个数（第一行的列数）
                int colsNum = row.getLastCellNum();
    //        定义动态数组存放原始数据项在excel中所在的位置
                ArrayList<Integer> dataIndexes = new ArrayList<>();
    //        遍历第一行的所有数据项名称，与当前计算单元数据项能匹配上的将其位置放入动态数组
                for (int i=0;i<colsNum;i++) {
                    String str = row.getCell(i).getStringCellValue();
                    if (key.contains(str)) {
                        dataIndexes.add(i);
                    }
                }

              /*
                进行数据处理
              */

    //            根据函数名称获取处理函数体
                Method method = this.getClass().getMethod(value,ArrayList.class,Sheet.class,String.class);
    //            进行方法执行
                sheet = (Sheet)method.invoke(this,dataIndexes,sheet,dataName);
            }
            FileOutputStream out = new FileOutputStream(path + sceneDataTitle +"train.xlsx");
            workbook.write(out);
            out.flush();
            out.close();
            workbook.close();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public Sheet add(ArrayList<Integer> dataIndexes,Sheet sheet,String dataName){

//        获取第一行的数据
        Row row = sheet.getRow(0);
        //获取sheet中最后一行行号（总共要处理的数据条目）
        int lastRowNum=sheet.getLastRowNum();
//        获取当前行最后单元格列号
        int colsNum = row.getLastCellNum();
//        在第一行新建一列存放数据特征名称
        Cell newData = row.createCell(colsNum);
        newData.setCellValue(dataName);
//        开始对每一行数据进行处理
        for (int i=1;i<=lastRowNum;i++){
            Row rowTemp = sheet.getRow(i);
            double sum = 0.0;
            for (int j=0;j< dataIndexes.size();j++){
                Cell cell=rowTemp.getCell(dataIndexes.get(j));
                double value =cell.getNumericCellValue();
                sum += value;
            }
//            经过计算的一行数据放到新建的最后一列中（注意是新建最后一列，所以用第一行的列数）
            Cell cell = rowTemp.createCell(colsNum);
            cell.setCellValue(sum);
        }
        return sheet;
    }

    public Sheet div(ArrayList<Integer> dataIndexes,Sheet sheet,String dataName){

//        获取第一行的数据
        Row row = sheet.getRow(0);
        //获取sheet中最后一行行号（总共要处理的数据条目）
        int lastRowNum=sheet.getLastRowNum();
//        获取当前行最后单元格列号
        int colsNum = row.getLastCellNum();
//        在第一行新建一列存放数据特征名称
        Cell newData = row.createCell(colsNum);
        newData.setCellValue(dataName);
//        开始对每一行数据进行处理
        for (int i=1;i<=lastRowNum;i++){
            Row rowTemp = sheet.getRow(i);
            double quotient = rowTemp.getCell(dataIndexes.get(0)).getNumericCellValue()/rowTemp.getCell(dataIndexes.get(1)).getNumericCellValue();
//            经过计算的一行数据放到新建的最后一列中（注意是新建最后一列，所以用第一行的列数）
            Cell cell = rowTemp.createCell(colsNum);
            cell.setCellValue(quotient);
        }
        return sheet;
    }

}
