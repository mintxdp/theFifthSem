#!/bin/sh
echo "File merging program"
echo "Enter name of file1"
read file1
echo "Enter name of file2"
read file2
echo "Enter name of file3"
read file3

#`sort $file1 | cat > $file1`
#`sort $file2 | cat > $file2`
#`sort $file3 | cat > $file3`
`cat >> result.txt $file1 $file2 $file3`
#`sort result.txt | cat > result.txt`
echo "Contents of files merged and sorted in result.txt."

