#include<iostream>
using namespace std;
int main()
{
  int s[20];
  s[0]=6;
  for(int i=1;i<=20;i++)
  {
    s[i]=s[i-1]+5*i;
  }
  
  int n;
  cin>>n;
  for(int j=0;j<n;j++)
  {
    cout<<s[j]<<" ";
  }
}