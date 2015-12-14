#include <iostream>

using namespace std;

int main() {
	bool high = false;
        for(int i = 2, j = 1; i >= 0; i--, j+=2) {
            for(int c = 1; c <= i; c++) {
                cout<<"  ";
            }
            high = false;
            for(int k = 1; k <= j; k++) {
                high = !high;
                cout<<(high ? 4 : 3)<<" ";
            }
            cout<<endl;
        }
        for(int i = 1, j = 3; i <= 2; i++, j-=2) {
            for(int c = 1; c <= i; c++) {
                cout<<"  ";
            }
            high = false;
            for(int k = 1; k <= j; k++) {
                high = !high;
                cout<<(high ? 4 : 3)<<" ";
            }
            cout<<endl;
        }
	return 0;
}