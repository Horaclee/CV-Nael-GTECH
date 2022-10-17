function copyToClipboard(element) {
  var $temp = $("<input>");
  $("body").append($temp);
  $temp.val($(element).text()).select();
  document.execCommand("copy");
  $temp.remove();
}



// dark mode
var toggle_btn = document.getElementById('theme-btn');

var body = document.getElementsByTagName('body')[0];


var dark_theme_class = 'dark';


toggle_btn.addEventListener('click', function() {

 if (body.classList.contains(dark_theme_class)) {

 body.classList.remove(dark_theme_class);

}

 else {

 body.classList.add(dark_theme_class);

}

});
//


const answer = document.getElementById("copyResult");
const copy   = document.getElementById("copyButton");
const selection = window.getSelection();
const range = document.createRange();
const textToCopy = document.getElementById("textToCopy")

copy.addEventListener('click', function(e) {
    range.selectNodeContents(textToCopy);
    selection.removeAllRanges();
    selection.addRange(range);
    const successful = document.execCommand('copy');
    if(successful){
      answer.innerHTML = 'Copied!';
    } else {
      answer.innerHTML = 'Unable to copy!';  
    }
    window.getSelection().removeAllRanges()
});