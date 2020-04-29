#include<iostream>
using namespace std;

struct college
{
  char name[100];
  char city[100];
  int year;
  float percent;
};

int main()
{
  int n;
cout<<"Enter the number of colleges";
  cin>>n;
  college s[n];
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter city";
    cin>>s[i].city;
    cout<<"\nEnter year of establishment";
    cin>>s[i].year;
    cout<<"\nEnter pass percentage";
    cin>>s[i].percent;
    }
   cout<<"\nDetails of colleges ";
    for(int i=0;i<n;i++)
  {
     
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:";
    cout<<s[i].name;
    cout<<"\nCity:";
    cout<<s[i].city;
    cout<<"\nYear of establishment:";
    cout<<s[i].year;
    cout<<"\nPass percentage:";
    cout<<s[i].percent;
    }
}