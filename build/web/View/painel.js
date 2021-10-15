adicionar = document.getElementById('add');
remove = document.getElementById('remove');
alterar = document.getElementById('alterar');
addFrame = document.getElementById('adicionarFrame');
removerFrame = document.getElementById('removerFrame');
alterarFrame = document.getElementById('alterarFrame');
listarFrame = document.getElementById('listarFrame');
function mostrarAdicionar() {
    addFrame.style.display = 'block';
    removerFrame.style.display = 'none';
    alterarFrame.style.display = 'none';
    listarFrame.style.display = 'none';
}
function mostrarRemover() {
    addFrame.style.display = 'none';
    removerFrame.style.display = 'block';
    alterarFrame.style.display = 'none';
    listarFrame.style.display = 'none';
}
function mostrarAlterar() {
    alterarFrame.style.display = 'block';
    addFrame.style.display = 'none';
    removerFrame.style.display = 'none';
    listarFrame.style.display = 'none';
}
function mostrarListar() {
    listarFrame.style.display = 'block';
    addFrame.style.display = 'none';
    removerFrame.style.display = 'none';
    alterarFrame.style.display = 'none';
}
function refresh() {
    alterarFrame.contentWindow.location.reload();
    addFrame.contentWindow.location.reload();
    removerFrame.contentWindow.location.reload();
}