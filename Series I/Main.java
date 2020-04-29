#include<iostream>
using namespace std;
int main()
{
  float series[20];
  series[0]=0.5;
  series[1]=1.5;
  for(int j=2;j<=20;j++)
  {
    series[j]=series[j-1]+3*(series[j-1]-series[j-2]);
  }
  int n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<series[i]<<" ";
  }
}