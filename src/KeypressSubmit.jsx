import { Component, createElement } from "react";

export class KeypressSubmit extends Component {
    constructor(props) {
        super(props);
    }

    render() {
		let inputClass = this.props.inputClass;
		let submitClass = this.props.submitClass;
		let inputs = document.getElementsByClassName(inputClass);
		let buttons = document.getElementsByClassName(submitClass);
		
		if(inputs.length==0) {
			console.warn('Warning: Keypress submit could not find any inputs with class name: '+inputClass);
		}
		if(buttons.length==0) {
			console.warn('Warning: Keypress submit could not find any buttons with class name: '+submitClass);
		}

		for (const input of inputs) {
			input.addEventListener('keyup', (event) => {
				if(event.keyCode == this.props.keyCode) {
					for(const button of buttons) {
						button.click();
					}
				}
			});
		}
        return(<div></div>);
    }
}
