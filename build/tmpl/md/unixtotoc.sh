# generate the full table of content model
pandoc -f markdown -t html -s --template=$3 -o $2 $1

# generate the right table of content page (especially remove unwanted entries, and add the "title" attribute)
grep -v "notoc" $1 | grep -v "\[comment]" | sed -rn -e 's#(.*)\[([^\[]*)\]\(([^\)]*)\).*#\1[\2](\3 "\2")#p' > $1.tmp
mv $1.tmp $1