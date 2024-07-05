package EmployeeSalarySystem;

public class Employee {
 String name;
 int salary;
 int workHours;
 int hireYear;

 public Employee(String name,int salary,int workHours, int hireYear){
     this.name=name;
     this.salary=salary;
     this.workHours=workHours;
     this.hireYear=hireYear;
 }
 public int tax(){
     if (this.salary<1000){
         return 0;
     }else {
         return (this.salary*3)/100;
     }
 }
 public int bonus(){
     if (this.workHours<40){
         return 0;
     }else {
         return (this.workHours-40)*30;
     }
 }
 public int raiseSalary(){
     if (this.hireYear<10){
         return (this.salary*5)/100;
     } else if(this.hireYear>9 && this.hireYear<20){
         return this.salary/10;
     } else {
         return (this.salary*15)/100;
     }
 }
 @Override
 public String toString(){
     return "Adı:"+this.name+"\nMaaşı:"+this.salary+"\nÇalışma Saati:"+this.workHours
             +"\nBaşlangıç Yılı:"+this.hireYear+"\nVergi:"+tax()+
             "\nBonus:"+bonus()+"\nMaaş Artısı:"+raiseSalary()+
             "\nVergi ve Bouslar ile birlikte maaş:"+(this.salary+bonus()-tax())+
             "\nToplam maaş:"+(this.salary+bonus()+raiseSalary()-tax()) ;
 }
}
