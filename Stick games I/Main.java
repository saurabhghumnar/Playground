#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  int sticks,points;
  sticks=n+m;
  points=n*m;
 int a[n][m];
  int count=1;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      a[i][j]=count;
      count++;
    }
  }
  if(n%2==0)
  	cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}