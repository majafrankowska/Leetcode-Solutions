# Read from the file file.txt and output the tenth line to stdout.

count = 0

while read line; do
    let 'count = count + 1'
    if [$count -eq 10]; then 
        echo $line 
        exit 0
    fi
done < file.txt


# 1. we intialize count with "count = 0"
# 2.  a while do loop, specifying it will read through a file line by line "while read line; do"
# 3.  incrementing count by one each pass by "let 'count=count+1'"
# 4.  as long as we don't go past tenth line "if [$count -eq 10]; then"
# 5.  print out the line "echo $line"
# 6. "exit 0" after the printing 
# 7. fi ending the loop 
# 8. then at the end we specify from what file it should "done < file.txt"
