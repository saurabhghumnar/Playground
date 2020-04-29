#include<iostream>
using namespace std;
int main()
{
  int s[20];
  s[0]=0;
  s[1]=2;
  int j=6;
  for(int i=2;i<=20;i++)
  {
    s[i]=s[i-1]+j;
    s[i+1]=s[i]+j;
    i++;
    j=j+4;
  }
  
  int n;
  cin>>n;
  for(int j=0;j<n;j++)
  {
    cout<<s[j]<<" ";
  }
}