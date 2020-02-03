package com.guigu;

public class test {
    public static void main(String[] args) {
        /*冒泡排序*/
//        int[] arrs={6,5,9,23,4,56,23,567,89};
//
//        for (int j= 0; j<arrs.length-1; j++) {
//            for (int i=0;i<arrs.length-1-j;i++){
//                if(arrs[i]>arrs[i+1]){
//                    int temp=arrs[i];
//                    arrs[i]=arrs[i+1];
//                    arrs[i+1]=temp;
//                }
//            }
//        }
//        for(int i=0;i<arrs.length;i++){
//            System.out.println(arrs[i]);
//        }

        /*选择排序*/
        int[] is={6,5,9,23,4,56,345,1};

        for(int j=0;j<is.length-1;j++){//找几次最大值
            int max=0;
            int index=0;
            for(int i=0;i<is.length-j;i++){
                if(is[i]>max){
                    max=is[i];
                    index=i;
                }
            }
            //得到最大值的索引值  index就是最大值的下标
            if(index!=is.length-1-j){
                //index  is.length-1
                int temp=is[index];
                is[index]=is[is.length-1-j];
                is[is.length-1-j]=temp;
            }
        }
        for(int i=0;i<is.length;i++){
            System.out.print(is[i]+" ");
        }


    }
}
