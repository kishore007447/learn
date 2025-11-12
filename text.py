#lets check the github 
'''
l=[10,25,23,5]
for i in l:
    if(i>18):
        print("eligible to vote")
    else:
        print("not eligible to vote")

#end of code

#sha-1 program
import hashlib
def hash_string(input_string):
    sha1_hash = hashlib.sha1()
    sha1_hash.update(input_string.encode())
    return sha1_hash.hexdigest()
input_str = "Hello, World!"
hashed_str = hash_string(input_str)
print(f"SHA-1 hash of '{input_str}': {hashed_str}")

'''

print('bye bye /......')


for i in range(0,12):
    print(i)