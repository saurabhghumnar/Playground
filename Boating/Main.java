#include<iostream>
using namespace std;
int main()
{
int max,adult,child;
  std::cin>>max>>adult>>child;
  if((75*adult + 30*child) > max)
  {
	std::cout<<"Boat will drow";
  }
   else
    std::cout<<"Boat is stable";
}