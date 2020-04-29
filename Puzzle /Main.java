#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int mat1[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>mat1[i][j];
    }
  }
  
  int ans[c][r];
for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      ans[i][j]=mat1[j][i];
    }
    
 }
  
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      cout<<ans[i][j]<<" ";
    }
    cout<<"\n";
    
 }

}