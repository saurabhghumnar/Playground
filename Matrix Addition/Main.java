#include<iostream>
using namespace std;

int main()
{
  int a,b;
 cin>>a>>b;
  
  const int r=a;
  const int c=b;
int mat1[r][c];
for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>mat1[i][j];
    }
  }
  int mat2[r][c];
for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>mat2[i][j];
    }
  }
  int ans[r][c];
for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      ans[i][j]=mat1[i][j]+mat2[i][j];
    }
  }
   for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cout<<ans[i][j]<<" ";
    }
     cout<<"\n";
  }
  return 0;
}



