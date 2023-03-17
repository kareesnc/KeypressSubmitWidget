import { Component, createElement } from "react";

export class KeypressSubmit extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        this.addListener(this.props.inputClass,this.props.submitClass,this.props.keyCode);
        return(<div></div>);
    }

    addListener(inputClass, submitButtonClass, keyCode) {
		let inputs = document.getElementsByClassName(inputClass);
		let buttons = document.getElementsByClassName(submitButtonClass);
		for (const input of inputs) {
			input.addEventListener('keyup', (event) => {
				if(event.keyCode == keyCode) {
					for(const button of buttons) {
						button.click();
					}
				}
			});
		}
    }
}
