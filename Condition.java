public class Condition{
    public  static void main(String []args){
       /*
       //int a = 4;
       int a = (int)(Math.random() * 100 );        //난수~ 모든 언어 거의 난수 제공됨 (0<= <100)
      System.out.println("a=" +a); 
//int 넣었기 때매 형변화되서 소수점이하 다 잘라져서 정수만 발생(0<= <1)
        if( a%2 == 1){
            System.out.println("홀수");
            System.out.println("제곱값은" + (a * a));
        }
        if(a%2 == 1){
            System.out.println("홀수");
        }else{
            System.out.println("짝수");
        }
        */

         //int year = 2023;
         System.out.print("출생년도를 입력하세요:");
         java.util.Scanner sc = new java.util.Scanner(System.in);
         int year = sc.nextInt();//키보드로부터 숫자값 입력받기


         System.out.println(year + "년도에 해당하는 동물을 출력하시오");
          //년도를 12로 나눈 나머지값이 0이면 원숭이, 1이면 닭, 2이면 개, 3이면 돼지,
         // 4이면 쥐, 5이면 소, 6이면 호랑이, 7이면 토끼, 
         //   8이면 용,  9  뱀    10이면 말  11이면 양  

       //아래의 if~else구문을 배열로 변환하세요 
         int mod = year%12;
         String[] ani = { "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양" };
         System.out.println(ani[mod]+"띠입니다");
       
        //if-else이 부분 배열로 바꿔보세여
        	

//		
//        if(mod == 0){
//            System.out.println("원숭이띠입니다");
//        }else if( mod == 1 ){
//             System.out.println("닭띠입니다");
//        }else if( mod == 2){
//            System.out.println("개띠입니다");
//        }else if( mod == 3){
//            System.out.println("돼지띠입니다");
//        }else if( mod == 4){
//           System.out.println("쥐띠입니다");
//        }else if(mod == 5){
//           System.out.println("소띠입니다");
//        }else if(mod == 6){
//           System.out.println("호랑이띠입니다");
//         }else if(mod == 7){
//             System.out.println("토끼");
//          }else if(mod == 8){
//             System.out.println("용");
//           }else if(mod ==9){
//              System.out.println("뱀");           
//            }else if(mod == 10){
//              System.out.println("말");
//              }else if(mod == 11){
//              System.out.println("양");
//              }
                
/*
              int koScore = 70;
              int engScore = 60;
              int mathScore = 84;
              int totalScore = koScore + engScore + mathScore;//총점
              float avg = (float)totalScore/3;   //    평균  int를int로 나누면 int 정수 나누기 정수는 정수
              //평균 totalScore/3.0F;
             System.out.println(avg);//71.3336
              //평균값이 90점이상이면 "A등급"을 출력
             // 80점이상이면 "B등급"을 출력
            //70점이상이면 "C등급"을 출력
           //60점이상이면 "D등급"을 출력
          // 60점 미만이면 "F등급"을 출력하시오
          System.out.println("평균에 해당 등급을 출력하시오");
         //TODO
      if(avg>=90){
        System.out.println("A");
          }else if(avg>= 80){
              System.out.println("B");
              }else if(avg>= 70){
              System.out.println("C");
              }else if(avg>= 60){
              System.out.println("D");
              }else if(avg< 60){
              System.out.println("F");
              }
           */
    	
    		String []name = {"가위", "바위", "보"};
            System.out.println("가위바위보게임");
            System.out.print("가위-1, 바위-2, 보-3을 입력하세요:");
//            java.util.Scanner sc = new java.util.Scanner(System.in);
           int u = sc.nextInt();//사용자가 낸 값
           System.out.println("사용자가 낸 값: " + name[u-1]);
//           if(u == 1) {
//        	   System.out.println("사용자가 낸 값: " + "가위");
//           }else if(u == 2) {
//        	   System.out.println("사용자가 낸 값: " + "바위");
//           }else if( u == 3) {
//        	   System.out.println("사용자가 낸 값: " + "보");
//           }
  
           int r = (int)(Math.random()*3+1);  //1<= <4  컴퓨터가 낸 값
           System.out.println("컴이 낸 값: " + name[r-1]);
           if(u == r){
             System.out.println("비겼습니다");
           }
          else if(u==1&&r==2){
            System.out.println("졌습니다");
 }          else if(u==1&&r==3){
               System.out.println("이겼습니다");    
}
            else if(u==2&&r==1){
               System.out.println("이겼습니다");    
}
             else if(u==2&&r==3){
               System.out.println("졌습니다");    
}
            else if(u==3&&r==1){
               System.out.println("졌습니다");    
}
             else if(u==3&&r==2){
               System.out.println("이겼습니다");   
}

              int a = 4;
              
              switch(a%2){
              case 1:
                //a를 2로 나눈 나머지값이 1인 케이스
                System.out.println("홀수");
                break;//케이스 빠져나올수있게 꼭 넣기
              case 0:
               //a를 2로 나눈 나머지값이 1인 케이스
               System.out.println("짝수");
              }

//              int year = 2023;
//              int mod = year%12;
              switch(mod){
              case 0: 
                   System.out.println("원숭이띠");
                   break;
               case 1:
                    System.out.println("닭띠");
                    break;
                  default://else랑 같은뜻
                  System.out.println("그외");
                  }        
                 java.util.Calendar c;
                  c = java.util.Calendar.getInstance();  //현재날짜객체    
                  int month = c.get(java.util.Calendar.MONTH);      //월:1월인 경우
                  System.out.println(month);//6
                   if(month <= 5){//상반기
                         System.out.println("현재" + (month + 1) + "월은 상반기입니다.");
                    }else{
                         System.out.println("현재" + (month + 1)+ "월은 하반기입니다.");
                    }
                  switch(month){   //byte, short, int, char, String<--ling 등은 스위치에서 이용불가
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                        System.out.println("현재" + (month + 1) + "월은 상반기입니다.");
                        break;
                    default:
                        System.out.println("현재" + (month + 1) + "월은 하반기입니다.");
}
}
}







