#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  int box,code;
  cin>>a>>b>>c;
  if(a<b && a<c)
  {
    if(b>a && b>c)
    {
      cout<<"The treasure is in box which has number "<<c;
    }
    else
    {
       cout<<"The treasure is in box which has number "<<b;
    }
  }  
  else if(a>b && a>c)
  {
    if(b<a && b<c)
    {
       cout<<"The treasure is in box which has number "<<c;     
    }
    else
    {
      cout<<"The treasure is in box which has number "<<b;
    }
  }
  else
  {
    cout<<"The treasure is in box which has number "<<a;
  }
int d=1;
int i=1;
while(i<=a&&i<=b&&i<=c)
{
if(a%i==0&&b%i==0&&c%i==0)
d=i;
i++;
}
  cout<<"\nThe code to open the box is "<<d;
    
}