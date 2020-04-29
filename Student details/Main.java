#include<iostream>
#include<string.h> 
#include<stdio.h>
using namespace std;

struct Student
{
  char name[30];
  char department[20];
  int year;
  float cgpa;
};

void swap (Student &x,Student &y)
{
Student temp;
temp=x;
x=y;
y=temp;
}

void sortname(Student x[],int n)
{
for (int i=0;i<n-1;i++)
for (int j=i+1;j<n;j++)
if (strcmp(x[i].name,x[j].name)>0)
swap(x[i],x[j]);
}

int main()
{
  int n;
cout<<"Enter the number of students"<<endl;
  cin>>n;
  Student s[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>s[i].name;
    cout<<"Enter department"<<endl;
    cin>>s[i].department;
    cout<<"Enter year of study"<<endl;
    cin>>s[i].year;
    cout<<"Enter cgpa"<<endl;
    cin>>s[i].cgpa;
    }
sortname(s,n);
   cout<<"Details of students "<<endl;
    for(int i=0;i<n;i++)
  {
     
    cout<<"Student "<<i+1<<endl;
    cout<<"Name:";
    cout<<s[i].name<<endl;
    cout<<"Department:";
    cout<<s[i].department<<endl;
    cout<<"Year of study:";
    cout<<s[i].year<<endl;
    cout<<"CGPA:";
    cout<<(s[i].cgpa)<<endl;
    }
}