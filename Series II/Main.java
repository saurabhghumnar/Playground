#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int s[20];
  s[0]=121;
  int root;
  for(int i=0;i<=20;i++)
  {
    root=sqrt(s[i]);
    root=root+4;
    s[i+1]=root*root;
  }
  
  
  int n;
  cin>>n;
  for(int j=0;j<n;j++)
  {
    cout<<s[j]<<" ";
  }
}