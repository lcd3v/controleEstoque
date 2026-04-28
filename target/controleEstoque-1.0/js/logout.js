document.getElementById("btnLogout").addEventListener("click", function(){
    localStorage.clear();
    sessionStorage.clear();
    window.location.href = "index.html";
});