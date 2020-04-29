#include<iostream>
using namespace std;
int type(int n,int *a)
{
  int e=0,o=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      e=e+1;
    }
    else
      o=o+1;
  }
  if(e==n)
    std::cout<<"The array is Even";
  else if(o==n)
    std::cout<<"The array is Odd";
  else
    std::cout<<"The array is Mixed";
}
int main()
{
  int n,a[n];
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  type(n,a);
  return 0;
}