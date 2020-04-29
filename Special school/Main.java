#include<iostream>
#include<string.h>
using namespace std;
int main()
{
string s1,s2;
  cin>>s1>>s2;
  int flag;
int len1=s1.length();
  int len2=s2.length();

  for(int i=0,j=len2-1;i<len1,j>=0;i++,j--)
  {
    if(s1[i]!=s2[j])
       {
         flag=1;
       }

  }
       if(flag==1)
       {
         cout<<"It is wrong";
       }
       else if(flag==0)
       {
         cout<<"It is correct";
       }
}