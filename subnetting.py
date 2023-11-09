add = input("Enter the I.P. address:")
octets = add.split(".")
print(octets)
cidr = int(input("Enter the CIDR address:"))
first = int(octets[0])
ipclass = ""
if 1<= first <=126:
    ipclass = 'A'
elif 128 <= first <= 191:
    ipclass = "B"
elif 192 <= first <= 223:
    ipclass = "C"
elif 224 <= first <= 239:
    ipclass = "D"
elif 240 <= first <= 255:
    ipclass = "E"
else:
    ipclass = "Unknown Class"
print("Class of the IP Address: ",ipclass)
binary_ip = "".join([format(int(octet), "08b") for octet in octets])
print(binary_ip)
numsub = 2 ** (32-cidr)
print("Number of IP address in each network: ",numsub)
sub = 256 // numsub
print("Total number of Networks: ",sub)
numhost = 2 ** (32-cidr) - 2
print("Number of hosts in each network:",numhost)