#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
string name;
  std::getline(std::cin,name);

for(std::string::reverse_iterator i=name.rbegin();i<name.rend();i++)
{
  cout<<*i;
}
}