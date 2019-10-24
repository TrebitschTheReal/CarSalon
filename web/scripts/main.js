$(document).ready(function () {


    manageCarsInputValidation('#upload-brand', '#upload-color', 'popover-upload-brand', '#upload-submit');
    manageCarsInputValidation('#upload-color', '#upload-brand', 'popover-upload-color', '#upload-submit');


    // manageCarsInputValidation('#modify-brand', '#modify-color', 'popover-modify-brand', '#modify-submit');
    // manageCarsInputValidation('#modify-color', '#modify-brand', 'popover-modify-color', '#modify-submit');

    ///////////////////////////////////////////

    function isInputNotLongEnough(id) {
        return $(id).val().length < 3;
    }

    function manageCarsInputValidation(inputBrand, inputColor, popover, submitButton) {
        $(inputBrand).keyup(function () {
            if (isInputNotLongEnough(inputBrand)) {
                $(submitButton).attr('disabled', true);
                $('[data-toggle="' + popover + '"]').popover('show');
                $(inputBrand).addClass('bg-danger');
            } else {
                if (!isInputNotLongEnough(inputColor)) {
                    $(submitButton).removeAttr('disabled');
                }
                $('[data-toggle="' + popover + '"]').popover('hide');
                $(inputBrand).removeClass('bg-danger');
                $(inputBrand).addClass('bg-success');
            }
        });
    }
});