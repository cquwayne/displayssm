package com.paper.ssm.controller;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.*;


@RestController
public class Deal {

    public final String path = "C:\\Users\\76133\\OneDrive\\毕业\\论文系统\\数据\\";
    public final String pathName = path+"test.xlsx";

    public void dealWith (LinkedHashMap<List<String>,String> featureList) throws Exception {

//        ① 根据每个HashMap中key值的List<String>读取原始数据excel文件中的数据项
//        ② 依据HashMap中的value值的String对应的方法进行数据处理，并将处理后的数据插入训练数据集的Excel文件

//        具体步骤为：
//        1. 读取原始数据集合excel文件（文件名：“”），读取为XSSFWorkbook对象，对象名称workbook
//        2. 获取excel文件中的第一行，找准Key中List<String>数据项所在的列,并创建新的数据列,提供数据列名
//        3. 对于数据项所在的列，每读取一行就计算一行,将计算结果放至新的数据项列


////        创建Excel对象
//        SXSSFWorkbook sxssfWorkbook = new SXSSFWorkbook();
////        创建一个居中格式
//        CellStyle style = sxssfWorkbook.createCellStyle();
//        style.setAlignment(HorizontalAlignment.CENTER);
////        创建Excel中的sheet对象
//        SXSSFSheet sxssfSheet = sxssfWorkbook.createSheet("训练数据");

//        读取原始数据集合所在的Excel文件
        File file = new File(pathName);
//        XSSFWorkbook workbook = new XSSFWorkbook(FileUtils.openInputStream(file));
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
        //两种方式读取工作表
//         Sheet sheet=workbook.getSheet("Sheet1");
        Sheet sheet = workbook.getSheetAt(0);
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
//            根据函数名称获取处理函数体
            Method method = this.getClass().getMethod(value,List.class,Sheet.class);
//            进行方法执行
            sheet = (Sheet)method.invoke(this,key,sheet);
        }
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();
        System.out.println("compute");
    }

    public Sheet add(List<String> datas,Sheet sheet) throws Exception {

//        获取第一行的数据
        Row row = sheet.getRow(0);
//        获取第一行所有数据项的个数（第一行的列数）
        int colsNum = row.getLastCellNum();
        /*
        识别所有需要操作的数据项
         */
//        定义动态数组存放原始数据项在excel中所在的位置
        ArrayList<Integer> arrayList = new ArrayList<>();
//        遍历第一行的所有数据项名称，与当前计算单元数据项能匹配上的将其位置放入动态数组
        for (int i=0;i<colsNum;i++) {
            String str = row.getCell(i).getStringCellValue();
            if (datas.contains(str)) {
                arrayList.add(i);
            }
        }
        //获取sheet中最后一行行号
        int lastRowNum=sheet.getLastRowNum();
//        在第一行新建一列存放数据特征名称

//        开始对每一行数据进行处理
        for (int i=1;i<lastRowNum;i++){
            Row rowTemp = sheet.getRow(i);
            double sum = 0.0;
            //获取当前行最后单元格列号
            for (int j=0;j< arrayList.size();j++){
                Cell cell=rowTemp.getCell(arrayList.get(j));
                double value =cell.getNumericCellValue();
                sum += value;
            }
//            经过计算的一行数据放到最后一列中
            Cell cell = rowTemp.createCell(lastRowNum);
            cell.setCellValue(sum);
        }
        return sheet;
    }

    public Sheet div(List<String> datas,Sheet sheet) throws Exception {
        for (int i=0;i<datas.size();i++) {
            System.out.println(datas.get(i));
        }
        return sheet;
    }

}
